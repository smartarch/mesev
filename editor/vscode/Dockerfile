FROM node:22

RUN curl -fsSL https://code-server.dev/install.sh | sh

# build our extension
WORKDIR /etc/vscode
COPY . .

RUN npm install
RUN npm install -g @vscode/vsce
RUN npm uninstall msv-language
RUN vsce package --allow-missing-repository --skip-license


# We want to have a user for the code server, where they cannot stop the server
#RUN useradd -m -g root -s /bin/bash user && \
#    echo "user:password" | chpasswd && \
#    mkdir -p /home/user/workspace && \
#    mkdir -p /opt/logs && \
#    chown -R user:root /home/user/workspace && \
#    chown -R user:root /opt/logs/

# another attempt with the scripts to be run by the user

COPY ./run.sh /etc/.run.sh
RUN chmod +x /etc/.run.sh
#RUN cp  /etc/vscode/msv-language-0.0.1.vsix /etc/msv-language-0.0.1.vsix
#RUN chown user:root /home/user/.run.sh && chmod +x /home/user/.run.sh


EXPOSE 8080

# Switch back to the user user
# USER user

# optional 
WORKDIR /workspaces/root/workspace
RUN code-server --install-extension /etc/vscode/msv-language-0.0.1.vsix

ENTRYPOINT ["/etc/.run.sh"]
