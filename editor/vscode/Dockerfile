FROM node:22

RUN curl -fsSL https://code-server.dev/install.sh | sh

WORKDIR /etc/vscode
COPY . .

RUN npm install
RUN npm install -g @vscode/vsce
RUN npm uninstall yms-language
RUN vsce package --allow-missing-repository --skip-license


COPY ./run.sh /etc/.run.sh
RUN chmod +x /etc/.run.sh


EXPOSE 8080


WORKDIR /workspaces/user/workspace
RUN code-server --install-extension /etc/vscode/yms-language-0.0.1.vsix

ENTRYPOINT ["/etc/.run.sh"]
